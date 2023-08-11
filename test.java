import org.apache.spark.sql.*;
import org.apache.spark.sql.expressions.Window;

public class CustomNameReplacementExample {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("CustomNameReplacementExample")
                .config("spark.some.config.option", "config-value")
                .getOrCreate();

        Dataset<Row> dataframe = spark.createDataFrame(
                spark.sparkContext().parallelize(
                        new Row[] {
                                RowFactory.create("Toto", "tata", "français"),
                                RowFactory.create("Rpt", "tata", "français"),
                                RowFactory.create("Rpt", "titi", "français"),
                                RowFactory.create("Marc", "toutou", "arabe"),
                                RowFactory.create("Rpt", "jean", "belge"),
                                RowFactory.create("Joe", "Luc", "indien")
                        }),
                DataTypes.createStructType(new StructField[] {
                        DataTypes.createStructField("nom", DataTypes.StringType, false),
                        DataTypes.createStructField("prénom", DataTypes.StringType, false),
                        DataTypes.createStructField("nationalité", DataTypes.StringType, false)
                })
        );

        Window spec = Window.partitionBy("nationalité").orderBy("nom");

        Dataset<Row> result = dataframe
                .withColumn("previous_nom", functions.lag(dataframe.col("nom"), 1).over(spec))
                .withColumn("nom_modifié", functions.when(dataframe.col("nom").equalTo("Rpt"), dataframe.col("previous_nom"))
                                .otherwise(dataframe.col("nom")))
                .withColumn("rank", functions.row_number().over(spec))
                .withColumn("last_name", functions.last(dataframe.col("nom")).over(spec));

        result.show();

        spark.stop();
    }
}

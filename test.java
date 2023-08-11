Dataset<Row> result = dataframe
                .withColumn("previous_nom", functions.lag(dataframe.col("nom"), 1).over(spec))
                .withColumn("row_count", functions.count(dataframe.col("nom")).over(spec))
                .withColumn("nom_modifié", functions.when(dataframe.col("nom").equalTo("Rpt"), 
                                functions.when(dataframe.col("row_count").equalTo(1), dataframe.col("previous_nom"))
                                .otherwise(dataframe.col("previous_nom"))))
                .withColumn("last_name", functions.last(dataframe.col("nom")).over(spec));

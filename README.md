# spring_batch_commandline_sample
## 説明
Spring Batchを`org.springframework.batch.core.launch.support.CommandLineJobRunner`を用いて実行するサンプルです。

## 要求事項
Java 7

## 実行方法
プロジェクトルートで以下コマンドを発行してください。
```
# libフォルダにライブラリを出力します。
mvn dependency:copy-dependencies -DoutputDirectory=lib
# ビルドします。
mvn clean package
# 実行します。
java -cp 'target/spring_batch_commandline_sample-1.0-SNAPSHOT.jar:lib/*' org.springframework.batch.core.launch.support.CommandLineJobRunner -next job-setting.xml job1
```

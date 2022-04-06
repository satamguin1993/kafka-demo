# kafka-demo

<h3>
Basic commands for the Kafka-Demo
</h3>

**Simple Video Link :**
https://www.youtube.com/watch?v=L_iu8HOus8k&list=LL&index=2&t=317s

**InstallingKafka Link:** https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273

**Installing Kafka:** brew install kafka

**Starting Zookeeper -**
/opt/homebrew/opt/kafka/bin/zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties

**Starting Kafka Server -**
/opt/homebrew/opt/kafka/bin/kafka-server-start /opt/homebrew/etc/kafka/server.properties

**Starting Kafka Producer(topic name : test) -**
kafka-console-producer --broker-list localhost:9092 --topic test

**Starting Kafka Consumer -**
kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning


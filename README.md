# ParameterSetter
This accepts the parameters to run a simulation. It is just a REST endpoint. I may try to build it with OpenAPI spec

No need for streams on this one since we will not be calling out to other APIs and this is just going to gather up the information and then send it on to Kafka (or maybe the DB first and then to Kafka)

THis is what we will probably use for Kafka compatibility
https://azure.microsoft.com/en-us/blog/announcing-the-general-availability-of-azure-event-hubs-for-apache-kafka/
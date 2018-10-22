# Shapeless Party Tricks in the Enterprise

Shapeless is a powerful library for strongly-typed generic programming in Scala. Numerous Scala libraries are using Shapeless to provide type class derivation and elegant functional APIs for JSON, binary protocols, test data generation, Spark Datasets, and even JDBC (an API which is now of legal drinking age).

While Shapeless is a solid foundation for library authors to build upon, it can also provide type-safe solutions for one-off use-cases. Without deep-diving into the details of Shapeless, I'll share a few bite-size examples of Shapeless-based solutions that feel a bit like type-level party tricks but were used to solve real problems while working on data engineering and WebSocket-based protocols at Fortune 500 companies.

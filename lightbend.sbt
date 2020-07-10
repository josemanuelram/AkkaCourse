resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/JazNF7BepGhIc7gX-MtLmd20ZwjyKb94WQyswlgSeh1uJLeK/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/JazNF7BepGhIc7gX-MtLmd20ZwjyKb94WQyswlgSeh1uJLeK/commercial-releases"))(Resolver.ivyStylePatterns)
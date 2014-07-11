(defproject raml-generator "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.raml/raml-parser "0.8.5"]
                 [com.github.jknack/handlebars "1.3.1"]]
  :repositories [["mulesoft-releases" "https://repository-master.mulesoft.org/releases/"]]
  :main ^:skip-aot raml-generator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

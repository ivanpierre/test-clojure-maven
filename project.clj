(defproject some-lib "0.0.1"
  :description "Librarie de test pour intégration Maven"
  :url "https://github.com/ivanpierre/test-clojure-maven"
  :deploy-repositories [["releases"
                         {:url
                          "https://api.bintray.com/maven/kilroysoft/clojure-test-maven/some-lib/;publish=1"
                          :sign-releases false
                          :username :env/bintray_username
                          :password :env/bintray_api_key}]
                        ["snapshots"
                         {:url "https://api.bintray.com/maven/kilroysoft/clojure-test-maven/some-lib/;publish=1"
                          :sign-releases false
                          :username :env/bintray_username
                          :password :env/bintray_api_key}]]
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]])

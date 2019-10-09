;; cerner_2^5_2019

(defn funcA
         "that funcA"
         [val]
         (println (str "val = " val)))

(defn funcB
         "that funcB"
         [val]
         (println (str "hi, " val)))

(def xxx (atom funcA))

(add-watch xxx :watcher (fn[k r os ns] (println "whoa! Atom changed")))

(@xxx "Steve")

(reset! xxx funcB)

(@xxx "Steve")
(ns data-driven
  (:require [clojure.edn :as edn]))

;; ------------------------------------------------------------
;; Task 10 – Data Driven Development
;; ------------------------------------------------------------

;; Data literal stored in EDN format
(def student-data
  (edn/read-string
   "
   {:course \"New Age Programming\"
    :semester 5
    :students
      [{:name \"Kritika\" :score 92}
       {:name \"Rohan\" :score 88}
       {:name \"Tina\" :score 94}]}
   "))

;; Function that uses data-driven logic
(defn topper [data]
  (->> (:students data)
       (apply max-key :score)))

(defn course-info [data]
  (str "Course: " (:course data)
       ", Semester: " (:semester data)))

;; ------------------------------------------------------------
(println (course-info student-data))
(println "Topper:" (topper student-data))
;; ------------------------------------------------------------
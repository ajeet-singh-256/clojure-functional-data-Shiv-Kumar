(ns data-manipulation)

;; ------------------------------------------------------------
;; Task 8 – Data Manipulation with Sequences
;; ------------------------------------------------------------

;; Sample dataset: A list of student maps
(def students
  [{:name "kritika" :score 85 :branch "CSE"}
   {:name "rohan"   :score 92 :branch "ECE"}
   {:name "simran"  :score 74 :branch "CSE"}
   {:name "arjun"   :score 67 :branch "ME"}
   {:name "tina"    :score 90 :branch "CSE"}])

;; 1. Extract all names using map
(def student-names
  (map :name students))

;; 2. Filter students with score >= 80
(def high-scorers
  (filter #(>= (:score %) 80) students))

;; 3. Calculate total score using reduce
(def total-score
  (reduce + (map :score students)))

;; 4. Convert all names to Capitalized format
(def capitalized-names
  (map #(clojure.string/capitalize (:name %)) students))

;; 5. Find average score
(def average-score
  (/ total-score (count students)))

;; ------------------------------------------------------------
(println "Student Names:" student-names)
(println "High Scorers:" high-scorers)
(println "Total Score:" total-score)
(println "Average Score:" average-score)
(println "Capitalized Names:" capitalized-names)

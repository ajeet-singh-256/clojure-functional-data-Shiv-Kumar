;; Task 5 – Pattern Matching & Restructuring

(println "=== Task 5: Pattern Matching & Data Restructuring ===")

;; ---------------------------------------------------------
;; 1. DESTRUCTURING WITH LISTS & VECTORS
;; ---------------------------------------------------------
(def nums [10 20 30])

;; Destructure vector elements
(let [[a b c] nums]
  (println "\n-- Vector Destructuring --")
  (println "a =" a)
  (println "b =" b)
  (println "c =" c))

;; Destructure nested structure
(let [[x [y z]] [1 [2 3]]]
  (println "\n-- Nested Destructuring --")
  (println "x =" x)
  (println "y =" y)
  (println "z =" z))


;; ---------------------------------------------------------
;; 2. MAP DESTRUCTURING
;; ---------------------------------------------------------
(def student {:name "Kritika"
              :age 21
              :course "ENSP415"})

(let [{name :name
       age :age
       course :course} student]
  (println "\n-- Map Destructuring --")
  (println "Name:" name)
  (println "Age:" age)
  (println "Course:" course))


;; Using shorthand destructuring (:keys [...])
(let [{:keys [name age course]} student]
  (println "\n-- Shorthand Map Destructuring --")
  (println name age course))


;; ---------------------------------------------------------
;; 3. FUNCTION ARGUMENT DESTRUCTURING
;; ---------------------------------------------------------
(defn show-point
  "Takes a vector [x y] and destructures inside function"
  [[x y]]
  (println "\n-- Destructuring in Function Args --")
  (println "Point X =" x ", Point Y =" y))

(show-point [5 8])


;; ---------------------------------------------------------
;; 4. PATTERN MATCHING USING `case`
;; ---------------------------------------------------------
(defn check-grade [score]
  (case score
    10 "Excellent"
    9  "Very Good"
    8  "Good"
    7  "Satisfactory"
    "Needs Improvement"))

(println "\n-- Pattern Matching: case --")
(println "Score 9 =" (check-grade 9))
(println "Score 6 =" (check-grade 6))


;; ---------------------------------------------------------
;; 5. PATTERN MATCHING USING `cond`
;; ---------------------------------------------------------
(defn classify-temperature [t]
  (cond
    (< t 0)  "Freezing"
    (< t 15) "Cold"
    (< t 25) "Warm"
    (< t 35) "Hot"
    :else    "Extreme"))

(println "\n-- Pattern Matching: cond --")
(println "Temperature 12 =" (classify-temperature 12))
(println "Temperature 40 =" (classify-temperature 40))


;; ---------------------------------------------------------
;; 6. RECORDS + DESTRUCTURING
;; ---------------------------------------------------------
(defrecord Person [name age city])

(def p (->Person "Kritika" 21 "New Delhi"))

(let [{:keys [name age city]} p]
  (println "\n-- Record Destructuring --")
  (println "Name:" name "Age:" age "City:" city))


;; ---------------------------------------------------------
;; 7. PATTERN MATCHING ON COLLECTION SHAPES
;; ---------------------------------------------------------
(defn shape-type [collection]
  (cond
    (map? collection) "It's a map"
    (vector? collection) "It's a vector"
    (list? collection) "It's a list"
    (set? collection) "It's a set"
    :else "Unknown type"))

(println "\n-- Pattern Matching Collection Types --")
(println (shape-type {:a 1}))
(println (shape-type [1 2 3]))
(println (shape-type '(1 2 3)))
(println (shape-type #{1 2 3}))



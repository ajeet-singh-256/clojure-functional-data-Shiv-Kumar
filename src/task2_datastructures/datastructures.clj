;; Task 2 – Basic Syntax & Data Structures


(println "=== Task 2: Basic Syntax & Data Structures ===")

;; --------------------------------------------------
;; 1. VARIABLES (Bindings)
;; --------------------------------------------------
(def x 10)
(def greeting "Hello Clojure")

(println "\n-- Variables --")
(println "x =" x)
(println "greeting =" greeting)


;; --------------------------------------------------
;; 2. LISTS
;; --------------------------------------------------
(def my-list '(1 2 3 4 5))

(println "\n-- Lists --")
(println "List:" my-list)
(println "First element:" (first my-list))
(println "Rest of list:" (rest my-list))


;; --------------------------------------------------
;; 3. VECTORS
;; --------------------------------------------------
(def my-vector [10 20 30 40])

(println "\n-- Vectors --")
(println "Vector:" my-vector)
(println "Element at index 2:" (nth my-vector 2))


;; --------------------------------------------------
;; 4. MAPS
;; --------------------------------------------------
(def my-map {:name "Kritika"
             :age 21
             :course "ENSP415"})

(println "\n-- Maps --")
(println "Map:" my-map)
(println "Name:" (:name my-map))
(println "Age:" (get my-map :age))


;; --------------------------------------------------
;; 5. SETS
;; --------------------------------------------------
(def my-set #{1 2 3})

(println "\n-- Sets --")
(println "Set:" my-set)
(println "Contains 2?" (contains? my-set 2))



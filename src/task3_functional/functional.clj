;; Task 3 – Functional Programming Concepts

(println "=== Task 3: Functional Programming Concepts ===")

;; ---------------------------------------------------------
;; 1. PURE FUNCTIONS
;; Pure functions:
;; - depend only on input arguments
;; - do not modify external state
;; - always return same output for same input
;; ---------------------------------------------------------

(defn add-numbers
  "Pure function: adds two numbers"
  [a b]
  (+ a b))

(defn square
  "Pure function: computes square"
  [x]
  (* x x))

(println "\n-- Pure Functions --")
(println "add-numbers 10 + 20 =" (add-numbers 10 20))
(println "square 5 =" (square 5))


;; ---------------------------------------------------------
;; 2. IMMUTABILITY
;; In Clojure, values do not change.
;; Every 'change' creates a NEW value.
;; ---------------------------------------------------------

(def original [1 2 3])
(def updated (conj original 4))

(println "\n-- Immutability --")
(println "Original vector:" original)
(println "Updated vector using conj:" updated)
(println "Notice original is unchanged → immutable")


;; ---------------------------------------------------------
;; 3. HIGHER-ORDER FUNCTIONS
;; Functions that:
;; - take other functions as input
;; - or return functions
;; ---------------------------------------------------------

;; Example 1: map (takes a function + a collection)
(def numbers [1 2 3 4 5])
(println "\n-- Higher-Order Functions: map --")
(println "Squares of numbers:" (map square numbers))


;; Example 2: filter
(println "\n-- Higher-Order Functions: filter --")
(println "Even numbers:" (filter even? numbers))


;; Example 3: reduce
(println "\n-- Higher-Order Functions: reduce --")
(println "Sum of list:" (reduce + numbers))


;; ---------------------------------------------------------
;; 4. ANONYMOUS FUNCTIONS
;; Functions created without names using (fn [])
;; or the shorthand #()
;; ---------------------------------------------------------

(println "\n-- Anonymous Functions --")
(println "Triple values:" (map #(* 3 %) numbers))


;; ---------------------------------------------------------
;; 5. FUNCTION RETURNING ANOTHER FUNCTION
;; This is also a higher-order function
;; ---------------------------------------------------------

(defn multiplier
  "Returns a new function that multiplies by 'n'"
  [n]
  (fn [x] (* n x)))

(def double-fn (multiplier 2))
(def triple-fn (multiplier 3))

(println "\n-- Function Returning Functions --")
(println "Double 10 =" (double-fn 10))
(println "Triple 10 =" (triple-fn 10))




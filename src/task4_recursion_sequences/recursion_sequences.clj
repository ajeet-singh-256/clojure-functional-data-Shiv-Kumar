;; Task 4 – Recursion & Sequence Operations


(println "=== Task 4: Recursion & Sequence Operations ===")

;; ---------------------------------------------------------
;; 1. SIMPLE RECURSION
;; Example: Calculate factorial of n
;; ---------------------------------------------------------
(defn factorial
  "Recursive factorial function"
  [n]
  (if (<= n 1)
    1
    (* n (factorial (dec n)))))

(println "\n-- Recursion: Factorial --")
(println "factorial 5 =" (factorial 5))


;; ---------------------------------------------------------
;; 2. TAIL RECURSION
;; More memory-efficient recursion using 'recur'
;; ---------------------------------------------------------
(defn sum-to
  "Tail-recursive function to compute sum from n to 1"
  ([n] (sum-to n 0))
  ([n acc]
   (if (zero? n)
     acc
     (recur (dec n) (+ acc n)))))

(println "\n-- Tail Recursion: Sum-to-N --")
(println "sum-to 10 =" (sum-to 10))


;; ---------------------------------------------------------
;; 3. SEQUENCE OPERATIONS
;; map, filter, reduce on a sequence of numbers
;; ---------------------------------------------------------
(def nums [1 2 3 4 5 6 7 8 9 10])

;; map
(println "\n-- Sequence Operation: map --")
(println "Squares:" (map #(* % %) nums))

;; filter
(println "\n-- Sequence Operation: filter --")
(println "Even numbers:" (filter even? nums))

;; reduce
(println "\n-- Sequence Operation: reduce --")
(println "Sum using reduce:" (reduce + nums))


;; ---------------------------------------------------------
;; 4. RECURSIVE SEQUENCE PROCESSING
;; Example: Custom recursive count function
;; ---------------------------------------------------------
(defn count-elements
  "Recursive function to count elements in a sequence"
  [coll]
  (if (empty? coll)
    0
    (+ 1 (count-elements (rest coll)))))

(println "\n-- Recursion on Sequence --")
(println "Counting elements in nums:" (count-elements nums))



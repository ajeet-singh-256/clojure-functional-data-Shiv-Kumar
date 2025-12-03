(ns transducers)

;; ------------------------------------------------------------
;; Task 9 – Data Transformation using Transducers
;; ------------------------------------------------------------

;; Dataset of numbers
(def nums [1 2 3 4 5 6 7 8 9 10])

;; Transducer pipeline:
;; 1. Filter even numbers
;; 2. Multiply each by 10
;; 3. Take only numbers > 30
(def my-xf
  (comp
   (filter even?)
   (map #(* % 10))
   (filter #(> % 30))))

;; Apply transducer using transduce
(def result
  (transduce my-xf conj [] nums))

;; Same operation but streaming through `sequence`
(def streamed
  (sequence my-xf nums))

;; ------------------------------------------------------------
(println "Transducer Result:" result)
(println "Streamed Sequence:" streamed)

;; Task 6 – Error Handling

(println "=== Task 6: Error Handling in Clojure ===")

;; ---------------------------------------------------------
;; 1. BASIC try–catch
;; ---------------------------------------------------------
(defn safe-divide
  "Performs division safely using try/catch"
  [a b]
  (try
    (/ a b)
    (catch ArithmeticException e
      (println "Error: Division by zero is not allowed.")
      nil)))

(println "\n-- Basic try/catch --")
(println "10 / 2 =" (safe-divide 10 2))
(println "10 / 0 =" (safe-divide 10 0))


;; ---------------------------------------------------------
;; 2. MULTIPLE CATCH BLOCKS
;; ---------------------------------------------------------
(defn parse-int
  "Parses a string to integer"
  [s]
  (try
    (Integer/parseInt s)
    (catch NumberFormatException e
      (println "Error: '" s "' is not a valid number.")
      nil)
    (catch Exception e
      (println "Unknown error occurred:" (.getMessage e))
      nil)))

(println "\n-- Multiple catch blocks --")
(println "parse-int \"123\" =" (parse-int "123"))
(println "parse-int \"abc\" =" (parse-int "abc"))


;; ---------------------------------------------------------
;; 3. finally BLOCK
;; ---------------------------------------------------------
(defn safe-open-file
  "Example using finally block for cleanup"
  [filename]
  (try
    (println "Opening file:" filename)
    (slurp filename)
    (catch Exception e
      (println "Failed to read file:" (.getMessage e)))
    (finally
      (println "Cleaning up... Closing resources."))))

(println "\n-- try/catch/finally --")
(safe-open-file "missing-file.txt") ;; Will fail but handle gracefully


;; ---------------------------------------------------------
;; 4. THROWING CUSTOM EXCEPTIONS
;; ---------------------------------------------------------
(defn check-age
  "Throws an exception for invalid age"
  [age]
  (if (pos? age)
    (println "Valid age:" age)
    (throw (Exception. "Age must be positive!"))))

(println "\n-- Throwing custom exception --")
(try
  (check-age -5)
  (catch Exception e
    (println "Caught exception:" (.getMessage e))))


;; ---------------------------------------------------------
;; 5. USING ex-info AND ex-data (Clojure-specific)
;; ---------------------------------------------------------
(defn validate-user
  "Uses ex-info and ex-data for rich error messages"
  [user]
  (if (:name user)
    (println "User OK:" user)
    (throw (ex-info "Missing name field" {:user user}))))

(println "\n-- ex-info / ex-data --")
(try
  (validate-user {:age 21})
  (catch Exception e
    (println "Error:" (.getMessage e))
    (println "Details:" (ex-data e))))



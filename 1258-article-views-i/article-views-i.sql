/* Write your T-SQL query statement below */
SELECT author_id AS id FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
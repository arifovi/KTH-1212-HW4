INSERT INTO Currency (id, name) VALUES (1, 'SEK');
INSERT INTO Currency (id, name) VALUES (2, 'USD');
INSERT INTO Currency (id, name) VALUES (3, 'GBP');
INSERT INTO Currency (id, name) VALUES (4, 'BDT');

-- SEK -> SEK
INSERT INTO Rate (from_id, to_id, rate) VALUES (1, 1, 1);
-- SEK -> USD
INSERT INTO Rate (from_id, to_id, rate) VALUES (1, 2, 0.12);
-- SEK -> GBP
INSERT INTO Rate (from_id, to_id, rate) VALUES (1, 3, 0.088);
-- SEK -> BDT
INSERT INTO Rate (from_id, to_id, rate) VALUES (1, 4, 9.74);

-- USD -> SEK
INSERT INTO Rate (from_id, to_id, rate) VALUES (2, 1, 8.51);
-- USD -> USD
INSERT INTO Rate (from_id, to_id, rate) VALUES (2, 2, 1);
-- USD -> GBP
INSERT INTO Rate (from_id, to_id, rate) VALUES (2, 3, 0.75);
-- USD -> BDT
INSERT INTO Rate (from_id, to_id, rate) VALUES (2, 4, 82.97);

-- GBP -> SEK
INSERT INTO Rate (from_id, to_id, rate) VALUES (3, 1, 11.33);
-- GBP -> USD
INSERT INTO Rate (from_id, to_id, rate) VALUES (3, 2, 1.33);
-- GBP -> GBP
INSERT INTO Rate (from_id, to_id, rate) VALUES (3, 3, 1);
-- GBP -> BDT
INSERT INTO Rate (from_id, to_id, rate) VALUES (3, 4, 110.47);

-- BDT -> SEK
INSERT INTO Rate (from_id, to_id, rate) VALUES (4, 1, 0.010);
-- BDT -> USD
INSERT INTO Rate (from_id, to_id, rate) VALUES (4, 2, 0.012);
-- BDT -> GBP
INSERT INTO Rate (from_id, to_id, rate) VALUES (4, 3, 0.0091);
-- BDT -> BDT
INSERT INTO Rate (from_id, to_id, rate) VALUES (4, 4, 1);


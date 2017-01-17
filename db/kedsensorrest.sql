
-- ********************************************************************************
-- *                       		   TABLES                             	          *
-- ******************************************************************************** 
CREATE TABLE temperature ( 

	tmp_id BIGINT NOT NULL,
	tmp_date TIMESTAMP,
	tmp_local VARCHAR(50),
	tmp_gps VARCHAR(10),
	tmp_temperature NUMERIC(9,2)
	
);

CREATE TABLE air_quality ( 

	aqlt_id BIGINT NOT NULL,
	aqlt_date TIMESTAMP,
	aqlt_local VARCHAR(50),
	aqlt_origin VARCHAR(10),
	aqlt_indicator VARCHAR(10),
	aqlt_price VARCHAR(10)
	
);

CREATE TABLE traffic_flow ( 

	tflw_id BIGINT NOT NULL,
	tflw_date TIMESTAMP,
	tflw_local VARCHAR(50),
	tflw_font VARCHAR(10),
	tflw_gps VARCHAR(10),
	tflw_min_car NUMERIC(9,0),
	tflw_foto VARCHAR(50),
	tflw_price VARCHAR(10)
	
);

CREATE TABLE heart_activity ( 

	hact_id BIGINT NOT NULL,
	hact_date TIMESTAMP,
	hact_font VARCHAR(10),
	hact_gps VARCHAR(10),
	hact_heartbeats NUMERIC(9,0)
	
);


-- ********************************************************************************
-- *                       		   CONSTRAINTS PRIMARY KEY                        *
-- ********************************************************************************

ALTER TABLE temperature
	ADD CONSTRAINT pktmpId
	PRIMARY KEY (tmp_id);
	
ALTER TABLE air_quality
	ADD CONSTRAINT pkaqltId
	PRIMARY KEY (aqlt_id);
	
ALTER TABLE traffic_flow
	ADD CONSTRAINT pktflwId
	PRIMARY KEY (tflw_id);
	
ALTER TABLE heart_activity
	ADD CONSTRAINT pkhactId
	PRIMARY KEY (hact_id);
    
-- ********************************************************************************
-- *                       		   CONSTRAINTS SEQUENCE                           *
-- ********************************************************************************  
    
CREATE SEQUENCE seqTemperature
    INCREMENT BY 1 
    START WITH 1 
    MINVALUE 1
;

CREATE SEQUENCE seqAirQuality
    INCREMENT BY 1 
    START WITH 1 
    MINVALUE 1
;

CREATE SEQUENCE seqTrafficFlow
    INCREMENT BY 1 
    START WITH 1 
    MINVALUE 1
;

CREATE SEQUENCE seqHeartActivity
    INCREMENT BY 1 
    START WITH 1 
    MINVALUE 1
;

-- ********************************************************************************
-- *                       		   SOME DATA                             	      *
-- ********************************************************************************
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-06-03 08:13:000', 'YYYYMMDD HH24:MI:SS'), 'Porto-Campanhã', 'A', 15.45);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-06-03 08:33:040', 'YYYYMMDD HH24:MI:SS'), 'Porto-Trindade', 'B', 13.75);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-06-03 08:39:450', 'YYYYMMDD HH24:MI:SS'), 'Porto-Campanhã', 'A', 15.85);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-06-03 08:41:220', 'YYYYMMDD HH24:MI:SS'), 'Porto-Trindade', 'B', 17.83);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-15 10:12:000', 'YYYYMMDD HH24:MI:SS'), 'Porto-S.Bento', 'C', 11.65);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-15 10:16:000', 'YYYYMMDD HH24:MI:SS'), 'Porto-Casa da Musica', 'D', 9.99);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-15 10:22:550', 'YYYYMMDD HH24:MI:SS'), 'Porto-S.Bento', 'C', 12.35);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-15 10:36:000', 'YYYYMMDD HH24:MI:SS'), 'Porto-Casa da Musica', 'D', 19.99);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-19 09:16:000', 'YYYYMMDD HH24:MI:SS'), 'Porto-S.Bento', 'C', 24.02);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-19 11:35:400', 'YYYYMMDD HH24:MI:SS'), 'Porto-Trindade', 'B', 18.43);
INSERT INTO temperature VALUES (nextval('seqTemperature'), to_timestamp('2016-07-19 13:56:030', 'YYYYMMDD HH24:MI:SS'), 'Porto-Casa da Musica', 'D', 27.22);

INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-06-05','YYYYMMDD'), '12h05', 'Porto-Av.Aliados', 'CMP', 'CO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-06-05','YYYYMMDD'), '12h44', 'Porto-Av.Boavista', 'CMP', 'CO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-06-05','YYYYMMDD'), '13h16', 'Porto-Av.Boavista', 'INE', 'NO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-06-05','YYYYMMDD'), '13h32', 'Porto-Av.Aliados', 'INE', 'NO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-07-11','YYYYMMDD'), '10h26', 'Porto-Ribeira', 'INE', 'CO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-07-11','YYYYMMDD'), '10h52', 'Porto-Foz', 'INE', 'CO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-07-11','YYYYMMDD'), '14h02', 'Porto-Ribeira', 'CMP', 'NO2', 'CC');
INSERT INTO air_quality VALUES (nextval('seqAirQuality'), to_timestamp('2016-07-11','YYYYMMDD'), '14h33', 'Porto-Foz', 'CMP', 'NO2', 'CC');

INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 07:43:233', 'YYYYMMDD HH24:MI:SS'), 'VCI-Antas', 'IdP', 'C', 0, 'URL12', '0,033');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 08:23:020', 'YYYYMMDD HH24:MI:SS'), 'VCI-Francos', 'CMP', 'D', 112, 'URL11', 'CC');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 08:58:520', 'YYYYMMDD HH24:MI:SS'), 'VCI-Amial', 'PSP', 'E', 112, 'URL32', '0,02');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 09:17:050', 'YYYYMMDD HH24:MI:SS'), 'VCI-A3', 'Brisa', 'F', 170, '', 'CC');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 09:19:250', 'YYYYMMDD HH24:MI:SS'), 'VCI-N14', 'PSP', 'G', 123, 'URL37', 'CC');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 09:33:450', 'YYYYMMDD HH24:MI:SS'), 'VNG-Devesas', 'Hel1', 'H', 55, '', '0,14');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 09:43:233', 'YYYYMMDD HH24:MI:SS'), 'VCI-Antas', 'IdP', 'C', 0, 'URL03', '0,05');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 10:03:000', 'YYYYMMDD HH24:MI:SS'), 'VCI-Francos', 'CMP', 'D', 132, 'URL25', 'CC');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 10:08:500', 'YYYYMMDD HH24:MI:SS'), 'VCI-Amial', 'PSP', 'E', 0, '', '0,02');
INSERT INTO traffic_flow VALUES (nextval('seqTrafficFlow'), to_timestamp('2016-06-12 10:11:100', 'YYYYMMDD HH24:MI:SS'), 'VCI-A3', 'Brisa', 'F', 128, '', 'CC');

INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 07:00:100', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 65);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 08:00:003', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 70);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 09:00:016', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 75);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 10:00:020', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 68);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 11:00:130', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 65);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 12:00:040', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 67);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 13:00:340', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 71);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 14:00:200', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 94);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 15:00:201', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 85);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 16:00:420', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 69);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 17:00:342', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 73);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 18:00:281', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 83);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 19:00:300', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 92);
INSERT INTO heart_activity VALUES (nextval('seqHeartActivity'), to_timestamp('2016-06-14 20:00:544', 'YYYYMMDD HH24:MI:SS'), 'Mobil1', '', 93);


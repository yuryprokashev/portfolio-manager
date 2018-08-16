-- Inserting Company Data
-- '5753b59f-05e4-42d0-a162-8870f338afde','Aurea'
-- c323261f-9722-4652-81c6-e35b66a94a7d','Ignite'
-- 'aee3f60a-b2fe-41c0-a1da-94f144c9c8fb','DevFactory'

INSERT INTO COMPANY (ID, NAME) VALUES ('5753b59f05e442d0a1628870f338afde','Aurea');

insert into company (id, name) values ('c323261f9722465281c6e35b66a94a7d','Ignite');

insert into company (id, name) values ('aee3f60ab2fe41c0a1da94f144c9c8fb','DevFactory');

-- Inserting Product Data for Aurea
-- 'dd139cdc-a001-4b53-b422-049364eabd99', 'Api Manager',
-- '7b85d81d-4ad0-42f9-b18e-28ecc0ad8d16', 'CX Process',
-- '43846674-18e7-407a-a3a6-d0d4dcf9e447', 'CX Messenger',
-- 'ecbe498c-31b9-42e7-975b-c41955909074', 'CX Monitor',
-- 'dae7ef1d-f4af-4a45-8d7e-a4b2af37277d', 'NuView Payroll',
-- '5411d7bf-9b48-4d6a-a8b0-9c6002d73310', 'DevSpaces',

INSERT INTO product (id, name, parent_id) values('dd139cdca0014b53b422049364eabd99', 'Api Manager', '5753b59f05e442d0a1628870f338afde');

INSERT INTO product (id, name, parent_id) values('7b85d81d4ad042f9b18e28ecc0ad8d16', 'CX Process', '5753b59f05e442d0a1628870f338afde');

INSERT INTO product (id, name, parent_id) values('4384667418e7407aa3a6d0d4dcf9e447', 'CX Messenger', '5753b59f05e442d0a1628870f338afde');

INSERT INTO product (id, name, parent_id) values('ecbe498c31b942e7975bc41955909074', 'CX Monitor', '5753b59f05e442d0a1628870f338afde');

-- Inserting Product Data for Ignite
INSERT INTO product (id, name, parent_id) values('dae7ef1df4af4a458d7ea4b2af37277d', 'NuView Payroll', 'c323261f9722465281c6e35b66a94a7d');

-- Inserting Product Data for DevFactory
INSERT INTO product (id, name, parent_id) values('5411d7bf9b484d6aa8b09c6002d73310', 'DevSpaces', 'aee3f60ab2fe41c0a1da94f144c9c8fb');

-- Inserting Features for Aurea.ApiManager
-- '54695fcb-f443-43b2-9b95-ad64e10e745b', 'Api Endpoints',

INSERT INTO FEATURE (id, name, parent_id) VALUES ('54695fcbf44343b29b95ad64e10e745b', 'Api Endpoints', 'dd139cdca0014b53b422049364eabd99');
-- Inserting Features for DevFactory.DevSpaces
-- '9d13410b-b75f-42e4-8476-991a93701dd7', 'Server-side Plugins'
INSERT INTO FEATURE (id, name, parent_id) VALUES ('9d13410bb75f42e48476991a93701dd7', 'Server-side Plugins', '5411d7bf9b484d6aa8b09c6002d73310');

-- Inserting Capabilities for Aurea.ApiManager.ApiEndpoints
-- '29f384dd-84a3-4187-a898-21f6641ef2a4', 'Read Api Endpoint Collection',
-- 'ccf9cabf-77cb-47b7-accf-5ada579e32bc', 'Add Api Endpoint to Collection',
-- 'a406824b-99e0-4b2b-b2d6-fb1ecd5e49da', 'Update Api Endpoint',
-- 'a45818cc-9986-4249-a9c0-ab95437e6ca3', 'Delete Api Endpoint',
-- '46d40bc8-57c3-4f83-acb7-1162eabb2a82', 'Read Api Endpoint Data',
-- '306189f3-1b41-4bc9-93f0-ff968bf0b0b7', 'Read Api Endpoint Operations',

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('29f384dd84a34187a89821f6641ef2a4', 'Read Api Endpoint Collection', '54695fcbf44343b29b95ad64e10e745b');

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('ccf9cabf77cb47b7accf5ada579e32bc', 'Add Api Endpoint to Collection', '54695fcbf44343b29b95ad64e10e745b');

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('a406824b99e04b2bb2d6fb1ecd5e49da', 'Update Api Endpoint', '54695fcbf44343b29b95ad64e10e745b');

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('a45818cc99864249a9c0ab95437e6ca3', 'Delete Api Endpoint', '54695fcbf44343b29b95ad64e10e745b');

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('46d40bc857c34f83acb71162eabb2a82', 'Read Api Endpoint Data', '54695fcbf44343b29b95ad64e10e745b');

INSERT INTO CAPABILITY (id, name, parent_id) VALUES ('306189f31b414bc993f0ff968bf0b0b7', 'Read Api Endpoint Operations', '54695fcbf44343b29b95ad64e10e745b');
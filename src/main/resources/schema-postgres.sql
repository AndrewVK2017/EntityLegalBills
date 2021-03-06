DROP TABLE IF EXISTS contract;
DROP TABLE IF EXISTS fin_params;


CREATE TABLE contract
(
  id            INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  par_id        INTEGER DEFAULT 0   NOT NULL,
  pay_id        INTEGER DEFAULT 0   NOT NULL,
  dog_id        INTEGER             NOT NULL,
  dog_num_s     VARCHAR             NOT NULL,
  dog_num       INTEGER             NOT NULL,
  name          VARCHAR             NOT NULL,
  reg_date      TIMESTAMP           NOT NULL,
  dog_type      INTEGER DEFAULT 0   NOT NULL,
  id_group      INTEGER DEFAULT 0   NOT NULL,
  id_department INTEGER DEFAULT 401 NOT NULL
);

CREATE TABLE fin_params
(
  id            INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  dog_id        INTEGER             NOT NULL,
--   в будущем будет связь с таблицей contract
  contract_id   INTEGER DEFAULT 0   NOT NULL,
  balance       DECIMAL(10,2)       NOT NULL,
  po_volume     INTEGER DEFAULT 0   NOT NULL,
  po_money      DECIMAL(10,2)       NOT NULL,
  op_date       TIMESTAMP           NOT NULL
);
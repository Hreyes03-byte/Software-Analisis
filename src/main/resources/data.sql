INSERT INTO usuarios (userid, nombre, dni, correo, contrasenia)
VALUES
(1, 'Andrea García', 70854521, 'andrea@gmail.com', '1234'),
(2, 'Luis Pérez', 70551234, 'luis@gmail.com', 'abcd');

INSERT INTO clientes (nombre, correo, ruc, telefono, fecha_registro) VALUES
('Juan Pérez', 'juan.perez@gmail.com', '10456321987', '987654321', '2024-06-01 10:00:00'),
('María López', 'maria.lopez@yahoo.com', '10785432109', '912345678', '2024-06-02 11:15:00'),
('Carlos Ramírez', 'carlos.ramirez@hotmail.com', '10987654321', '934567812', '2024-06-03 09:30:00'),
('Ana Torres', 'ana.torres@gmail.com', '10321478596', '945612378', '2024-06-04 13:45:00'),
('Luis Sánchez', 'luis.sanchez@gmail.com', '10879654123', '976543210', '2024-06-05 08:20:00'),
('Valeria Díaz', 'valeria.diaz@gmail.com', '10234567890', '987123456', '2024-06-06 14:10:00'),
('Javier Ruiz', 'javier.ruiz@hotmail.com', '10912345678', '998765432', '2024-06-07 15:30:00'),
('Rosa Medina', 'rosa.medina@gmail.com', '10765439876', '978934512', '2024-06-08 16:00:00'),
('Pedro Aguilar', 'pedro.aguilar@yahoo.com', '10654321987', '964783215', '2024-06-09 10:50:00'),
('Lucía Herrera', 'lucia.herrera@hotmail.com', '10487654321', '987345120', '2024-06-10 12:00:00'),
('Alonso Vega', 'alonso.vega@gmail.com', '10567891234', '973456781', '2024-06-11 09:10:00'),
('Carmen Ríos', 'carmen.rios@yahoo.com', '10345678912', '956712349', '2024-06-12 13:00:00'),
('Bruno Castañeda', 'bruno.castaneda@gmail.com', '10893421567', '901234567', '2024-06-13 14:50:00'),
('Isabel Fuentes', 'isabel.fuentes@hotmail.com', '10987612345', '987612345', '2024-06-14 11:45:00'),
('Tomás Salazar', 'tomas.salazar@gmail.com', '10781234567', '965432187', '2024-06-15 10:10:00'),
('Mónica Paredes', 'monica.paredes@gmail.com', '10432187654', '976123849', '2024-06-16 16:30:00'),
('Diego León', 'diego.leon@gmail.com', '10998765432', '986754320', '2024-06-17 08:00:00'),
('Fiorella Vargas', 'fiorella.vargas@hotmail.com', '10321098765', '945672139', '2024-06-18 09:40:00'),
('Rodrigo Acosta', 'rodrigo.acosta@yahoo.com', '10678943210', '954321876', '2024-06-19 14:20:00'),
('Sofía Gálvez', 'sofia.galvez@gmail.com', '10876543219', '963789421', '2024-06-20 17:00:00');

insert into cabezera(pago, observacions, fecha_registro, guia, cliente_id) VALUES
('efectivo', 'ninguna', '2025-06-11  08:00:00', 'rf213', 1);


INSERT INTO muestra(cabezera_id, codigo_muestra, descripcion, tipo_muestra, origen, fecha_recepcion, peso, estado_muestra) VALUES
(1, 'rf213', 'ahua tratada', 'oro', 'chala', '2025-06-11  08:00:00', 1.3, 'buena');

INSERT INTO detalle (muestra_id, metodo_analisis, elemento) VALUES
(1, 'analsisi1', 'oro');
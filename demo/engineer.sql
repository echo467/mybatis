CREATE TABLE `engineer` (
  `id` bigint(20) NOT NULL ,
  ` name` varchar(10) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  ` location` varchar(50) DEFAULT NULL,
  ` identity_number` varchar(18)  DEFAULT NULL ,

  ` expiration_date` varchar(20) DEFAULT NULL,
  ` position` varchar(20) DEFAULT NULL,
  ` title` varchar(20)  DEFAULT NULL,
  ` education` varchar(100)  DEFAULT NULL,
  ` phone` varchar(11)  DEFAULT NULL,
  ` employment_start` datetime  DEFAULT NULL,

   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

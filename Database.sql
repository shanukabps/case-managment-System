-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2019 at 02:03 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lawyer1`
--

-- --------------------------------------------------------

--
-- Table structure for table `addcase`
--

CREATE TABLE `addcase` (
  `CaseID` varchar(10) NOT NULL,
  `CaseNo` varchar(20) NOT NULL,
  `CaseType` varchar(6) NOT NULL,
  `CaseDes` varchar(1000) DEFAULT NULL,
  `CaseDate` date DEFAULT NULL,
  `ClientID` varchar(10) NOT NULL,
  `CourtNo` varchar(10) NOT NULL,
  `Evidence` varchar(6000) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addcase`
--

INSERT INTO `addcase` (`CaseID`, `CaseNo`, `CaseType`, `CaseDes`, `CaseDate`, `ClientID`, `CourtNo`, `Evidence`, `Status`) VALUES
('C01', '3367/GH', 'Trail', 'gfdsjk tuetkr gsafsjk hfk,mbc,hj', '2019-10-31', '01', '002/KH', '', 'New'),
('C02', '733/AD', 'Trail', 'AFghh,kb khjkl.f.g kjhkf,gnb,ygkf,nv,bvc,\r\nfhgdfdmfjhf \r\nhjgfjgcn mbvdjf', '2019-10-30', '02', '001/KD', 'fvsdav\r\ngjcxvky', 'New'),
('C03', '9067/WD', 'Trail', 'hgffgjks jhgdfgnmdfg ', '2019-11-01', '01', '001/KD', 'fggdhfjdtikm', 'New'),
('C04', '4578/DF', 'Call', 'jjjjjjjjjjjjjjjjjjjjjjjjjj', '2019-10-25', '09', '001/KD', '', 'New'),
('C05', '324/PK', 'Trail', 'gfjd vughlkgmmdks lsuieytmds,ndbv', '2019-10-25', '01', '005/KRD', 'hfdj,mb mczkd,fgdjkgfd', 'New'),
('C06', '45236/LK', 'Trail', 'gfjdsgdla jdgjgfdmbv gdsfjdsm bnmxcvbcxn jhmcbjgdjmbv gfjsdmhnmx', '2019-10-24', '01', '001/KD', 'fjhdgfdms hgfgdjgmbmn', 'New'),
('C07', '5678/RT', 'Trail', 'fdsjkhjfsd hdsfjdskfd', '2019-10-22', '01', '001/KD', 'sdfydskgjfd jhkfmdvnmydf', 'New'),
('C08', '9086/UY', 'Trail', 'fgdskjfd jfjhdvb ghmcxvhxs', '2019-10-29', '02', '003/WD', 'gfdhsjmxvyc jgvcjmbncx', 'New'),
('C09', '345/Gu', 'Call', 'pppppppppppppppppp', '2019-10-21', '02', '006/KRH', 'fhfhcgch', 'Pending'),
('C10', '3423/LJ', 'Trail', 'ghgjkjklk', '2019-10-20', '04', '001/KD', '', 'Pending'),
('C11', '2456/GH', 'Trail', 'hdgjlgfd', '2019-10-25', '06', '001/KD', '', 'New'),
('C12', '3467/K', 'Call', 'rgrtjyukiu', '2019-08-03', '07', '004/WH', 'ujhfhg', 'Pending'),
('C13', '9786/FR', 'Call', 'tytiyuouikkkkkkkkkkkkkkkkk', '2019-10-29', '08', '004/WH', '', 'New'),
('C14', '5634/MH', 'Trail', 'ffhgjgh', '2019-07-31', '05', '003/WD', '', 'Pending'),
('C15', '3490/ER', 'Call', 'jhjhkjljkghf', '2019-10-30', '08', '001/KD', '', 'New');

-- --------------------------------------------------------

--
-- Table structure for table `addclient`
--

CREATE TABLE `addclient` (
  `ClientID` varchar(10) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `SecondName` varchar(100) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Age` int(2) NOT NULL,
  `Phone` int(10) NOT NULL,
  `Address` varchar(300) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `RegisterDate` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `addclient`
--

INSERT INTO `addclient` (`ClientID`, `FirstName`, `SecondName`, `NIC`, `Age`, `Phone`, `Address`, `Gender`, `RegisterDate`) VALUES
('01', 'Sumith', 'Perera', '890675345V', 45, 712345674, '456, Joseph Street, Kuliyapitiya', 'Male', '2019-07-14 00:00:00.000000'),
('02', 'Nimal', 'Rajapaksha', '890567312V', 54, 775634124, 'No 467/E, Tekkawatta, Maho', 'Male', '2019-07-24 00:11:00.000000'),
('03', 'Nayana', 'Kumuduni', '674563156V', 56, 112345645, '323/12, Temple Road, Pannala', 'Female', '2019-07-24 00:13:00.000000'),
('04', 'Ranjith', 'Silva', '567129789V', 78, 712356490, '64/2, Yakkala Road, Wariyapola', 'Male', '2019-07-24 00:16:00.000000'),
('05', 'Kasun', 'Danjaya', '126656789v', 42, 716754234, 'No 1/56, Chilaw Road, Dankotuwa', 'Male', '2019-07-29 18:18:00.000000'),
('06', 'Nipuna', 'Sranga', '934562190V', 29, 715673490, 'No 82, Jayanthi Mawatha, Kuliyapitiya', 'Male', '2019-08-03 11:54:00.000000'),
('07', 'Sunil ', 'Ariyarathna', '645129674V', 56, 773451854, 'No92/A, Lower Street, Naththandiya', 'Male', '2019-08-03 12:36:00.000000'),
('08', 'Meena', 'Kumari', '554367109V', 58, 775642389, 'No 256, Main Street,Kurunegala', 'Female', '2019-08-03 12:39:00.000000'),
('09', 'Kushani', 'Nilusha', '976190867V', 22, 782345890, 'No 45/D, Warepola, Wariyapola', 'Female', '2019-10-20 16:59:00.000000'),
('10', 'Priyantha ', 'Basnayeka', '978456120V', 22, 772349087, 'N0 160, Kandy Road,Kurunegala', 'Male', '2019-10-25 16:17:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `court`
--

CREATE TABLE `court` (
  `CourtNo` varchar(10) NOT NULL,
  `CourtName` varchar(200) NOT NULL,
  `Location` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `court`
--

INSERT INTO `court` (`CourtNo`, `CourtName`, `Location`) VALUES
('001/KD', 'Kuliyapitiya- District Court', 'Migahakutuwa, Kuliyapitiya'),
('002/KH', 'Kulipatiya- High Court', 'Migahakotuwa, Kuliyapitiya'),
('003/WD', 'Wariyapola- District Court', 'Wariyapola'),
('004/WH', 'Wariyapola- High Court', 'Wariyapola'),
('005/KRD', 'Kurunegela- District Court', 'Kurunegala'),
('006/KRH', 'Kurunegala- High Court', 'Kurunegala'),
('hgff', 'gb', 'vbvc');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `uname` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uname`, `pass`) VALUES
('clerk', '2345'),
('admin', '12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addcase`
--
ALTER TABLE `addcase`
  ADD PRIMARY KEY (`CaseID`),
  ADD KEY `addcase_ibfk_1` (`ClientID`),
  ADD KEY `addcase_ibfk_2` (`CourtNo`);

--
-- Indexes for table `addclient`
--
ALTER TABLE `addclient`
  ADD PRIMARY KEY (`ClientID`),
  ADD UNIQUE KEY `NIC` (`NIC`);

--
-- Indexes for table `court`
--
ALTER TABLE `court`
  ADD PRIMARY KEY (`CourtNo`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `addcase`
--
ALTER TABLE `addcase`
  ADD CONSTRAINT `addcase_ibfk_1` FOREIGN KEY (`ClientID`) REFERENCES `addclient` (`ClientID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `addcase_ibfk_2` FOREIGN KEY (`CourtNo`) REFERENCES `court` (`CourtNo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

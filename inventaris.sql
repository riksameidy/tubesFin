-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 07, 2016 at 06:56 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventaris`
--

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nama` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Admin`
--

INSERT INTO `Admin` (`username`, `password`, `nama`) VALUES
('riksameidy', 'yu', 'Riksa Meidy Karim');

-- --------------------------------------------------------

--
-- Table structure for table `Barang`
--

CREATE TABLE `Barang` (
  `idBarang` varchar(15) NOT NULL,
  `namaBarang` varchar(25) NOT NULL,
  `hargaBarang` double NOT NULL,
  `status` varchar(10) NOT NULL,
  `kategoriBarang` varchar(25) NOT NULL,
  `lokasi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `BarangRusak`
--

CREATE TABLE `BarangRusak` (
  `tanggalRusak` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `idBarang` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `DepartemenInventaris`
--

CREATE TABLE `DepartemenInventaris` (
  `username` varchar(15) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `idDI` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DepartemenInventaris`
--

INSERT INTO `DepartemenInventaris` (`username`, `password`, `nama`, `idDI`) VALUES
('fauzan', 'fauzan', 'Fauzan Ramadhan S', '0000000001'),
('rizky', 'rizky', 'Rizky M Rifai', '0000000002');

-- --------------------------------------------------------

--
-- Table structure for table `DepartemenKeuangan`
--

CREATE TABLE `DepartemenKeuangan` (
  `username` varchar(15) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `idDK` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DepartemenKeuangan`
--

INSERT INTO `DepartemenKeuangan` (`username`, `password`, `nama`, `idDK`) VALUES
('wk', 'wk', 'I Komang Hendra W ', '000000000000001');

-- --------------------------------------------------------

--
-- Table structure for table `Fakultas`
--

CREATE TABLE `Fakultas` (
  `NamaFakultas` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Fakultas`
--

INSERT INTO `Fakultas` (`NamaFakultas`) VALUES
('FIF');

-- --------------------------------------------------------

--
-- Table structure for table `KategoriBarang`
--

CREATE TABLE `KategoriBarang` (
  `namaKategori` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Lokasi`
--

CREATE TABLE `Lokasi` (
  `namaLokasi` varchar(25) NOT NULL,
  `fakultas` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Lokasi`
--

INSERT INTO `Lokasi` (`namaLokasi`, `fakultas`) VALUES
('Gedung E', 'FIF');

-- --------------------------------------------------------

--
-- Table structure for table `PemeliharaanBarang`
--

CREATE TABLE `PemeliharaanBarang` (
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `idBarang` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `biaya` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `PemindahanBarang`
--

CREATE TABLE `PemindahanBarang` (
  `tanggalPemindahan` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `asal` varchar(25) NOT NULL,
  `tujuan` varchar(25) NOT NULL,
  `idBarang` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Tanah`
--

CREATE TABLE `Tanah` (
  `idTanah` varchar(15) NOT NULL,
  `Luas` double NOT NULL,
  `LokasiTanah` varchar(25) NOT NULL,
  `AlamatLengkap` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `Barang`
--
ALTER TABLE `Barang`
  ADD PRIMARY KEY (`idBarang`),
  ADD KEY `kategoriBarang` (`kategoriBarang`),
  ADD KEY `lokasi` (`lokasi`);

--
-- Indexes for table `BarangRusak`
--
ALTER TABLE `BarangRusak`
  ADD PRIMARY KEY (`tanggalRusak`),
  ADD KEY `idBarang` (`idBarang`);

--
-- Indexes for table `DepartemenInventaris`
--
ALTER TABLE `DepartemenInventaris`
  ADD PRIMARY KEY (`username`),
  ADD UNIQUE KEY `idDI` (`idDI`);

--
-- Indexes for table `DepartemenKeuangan`
--
ALTER TABLE `DepartemenKeuangan`
  ADD PRIMARY KEY (`username`),
  ADD UNIQUE KEY `idDK` (`idDK`);

--
-- Indexes for table `Fakultas`
--
ALTER TABLE `Fakultas`
  ADD PRIMARY KEY (`NamaFakultas`);

--
-- Indexes for table `KategoriBarang`
--
ALTER TABLE `KategoriBarang`
  ADD PRIMARY KEY (`namaKategori`);

--
-- Indexes for table `Lokasi`
--
ALTER TABLE `Lokasi`
  ADD PRIMARY KEY (`namaLokasi`),
  ADD KEY `fakultas` (`fakultas`);

--
-- Indexes for table `PemeliharaanBarang`
--
ALTER TABLE `PemeliharaanBarang`
  ADD PRIMARY KEY (`tanggal`),
  ADD KEY `idBarang` (`idBarang`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `PemindahanBarang`
--
ALTER TABLE `PemindahanBarang`
  ADD PRIMARY KEY (`tanggalPemindahan`),
  ADD KEY `idBarang` (`idBarang`);

--
-- Indexes for table `Tanah`
--
ALTER TABLE `Tanah`
  ADD PRIMARY KEY (`idTanah`),
  ADD KEY `LokasiTanah` (`LokasiTanah`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Barang`
--
ALTER TABLE `Barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kategoriBarang`) REFERENCES `KategoriBarang` (`namaKategori`) ON DELETE CASCADE,
  ADD CONSTRAINT `barang_ibfk_2` FOREIGN KEY (`lokasi`) REFERENCES `Lokasi` (`namaLokasi`);

--
-- Constraints for table `BarangRusak`
--
ALTER TABLE `BarangRusak`
  ADD CONSTRAINT `barangrusak_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `Barang` (`idBarang`);

--
-- Constraints for table `Lokasi`
--
ALTER TABLE `Lokasi`
  ADD CONSTRAINT `fk1` FOREIGN KEY (`fakultas`) REFERENCES `Fakultas` (`NamaFakultas`) ON DELETE CASCADE;

--
-- Constraints for table `PemeliharaanBarang`
--
ALTER TABLE `PemeliharaanBarang`
  ADD CONSTRAINT `pemeliharaanbarang_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `Barang` (`idBarang`) ON DELETE CASCADE,
  ADD CONSTRAINT `pemeliharaanbarang_ibfk_2` FOREIGN KEY (`username`) REFERENCES `DepartemenInventaris` (`username`) ON DELETE CASCADE;

--
-- Constraints for table `PemindahanBarang`
--
ALTER TABLE `PemindahanBarang`
  ADD CONSTRAINT `pemindahanbarang_ibfk_1` FOREIGN KEY (`idBarang`) REFERENCES `Barang` (`idBarang`);

--
-- Constraints for table `Tanah`
--
ALTER TABLE `Tanah`
  ADD CONSTRAINT `tanah_ibfk_1` FOREIGN KEY (`LokasiTanah`) REFERENCES `Lokasi` (`namaLokasi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

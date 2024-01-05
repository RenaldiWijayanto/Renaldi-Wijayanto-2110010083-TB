-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Jan 2024 pada 07.15
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengelolaankrs`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputkrs`
--

CREATE TABLE `inputkrs` (
  `nim` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `kd_matkul` varchar(50) NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `dosen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `inputkrs`
--

INSERT INTO `inputkrs` (`nim`, `nama`, `kd_matkul`, `nama_matkul`, `sks`, `semester`, `dosen`) VALUES
(2110010070, 'Ibnu Abbas', '4876', 'Pemrograman Visual 3', '2', '5', 'Ibu ihda Innar Ridho'),
(2110010070, 'Ibnu Abbas', '7049', 'STATISTIKA', '3', '5', 'Ibu Galih'),
(2110010070, 'Ibnu Abbas', '8740', 'Rekayasa Perangkat Lunak', '3', '5', 'Ibu Mutia Farida'),
(2110010070, 'Ibnu Abbas', '9021', 'Interaksi Manusia dan Kompuer', '3', '5', 'Bapa Budi Ramadhani'),
(2110010083, 'Renaldi Wijayanto', '3580', 'Multimedia', '2', '5', 'Bapa Auliya Rahman '),
(2110010083, 'Renaldi Wijayanto', '3609', 'Pemrograman Berbasis Object  2', '3', '5', 'Bapa Edya Rosadi'),
(2110010083, 'Renaldi Wijayanto', '4876', 'Pemrograman Visual 3', '2', '5', 'Ibu ihda Innar Ridho'),
(2110010083, 'Renaldi Wijayanto', '7049', 'STATISTIKA', '3', '5', 'Ibu Galih'),
(2110010080, 'Salsabila', '2070', 'Kecerdasan Buatan1', '2', '5', 'Ibu Mayang Sari'),
(2110010080, 'Salsabila', '3580', 'Multimedia', '2', '5', 'Bapa Auliya Rahman '),
(2110010080, 'Salsabila', '3609', 'Pemrograman Berbasis Object  2', '3', '5', 'Bapa Edya Rosadi'),
(2110010080, 'Salsabila', '4876', 'Pemrograman Visual 3', '2', '5', 'Ibu ihda Innar Ridho'),
(2110010080, 'Salsabila', '8740', 'Rekayasa Perangkat Lunak', '3', '5', 'Ibu Mutia Farida');

-- --------------------------------------------------------

--
-- Struktur dari tabel `matkul`
--

CREATE TABLE `matkul` (
  `kd_matkul` int(20) NOT NULL,
  `nama_matkul` varchar(100) NOT NULL,
  `sks` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `dosen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `matkul`
--

INSERT INTO `matkul` (`kd_matkul`, `nama_matkul`, `sks`, `semester`, `dosen`) VALUES
(2070, 'Kecerdasan Buatan1', '2', '5', 'Ibu Mayang Sari'),
(3580, 'Multimedia', '2', '5', 'Bapa Auliya Rahman '),
(3609, 'Pemrograman Berbasis Object  2', '3', '5', 'Bapa Edya Rosadi'),
(4876, 'Pemrograman Visual 3', '2', '5', 'Ibu ihda Innar Ridho'),
(7049, 'STATISTIKA', '3', '5', 'Ibu Galih'),
(8740, 'Rekayasa Perangkat Lunak', '3', '5', 'Ibu Mutia Farida'),
(9021, 'Interaksi Manusia dan Kompuer', '3', '5', 'Bapa Budi Ramadhani');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mhs`
--

CREATE TABLE `mhs` (
  `nim` int(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jk` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `studi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mhs`
--

INSERT INTO `mhs` (`nim`, `nama`, `alamat`, `jk`, `jurusan`, `studi`) VALUES
(2110010080, 'Salsabila', 'Martapura', 'Perempuan', 'Sistem Informasi', 'Diploma (D3)'),
(2110010083, 'Renaldi Wijayanto', 'Pulang Pisau', 'Laki - laki', 'Teknik Informatika', 'Sarjana Strata 1 (S1)');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`kd_matkul`);

--
-- Indeks untuk tabel `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

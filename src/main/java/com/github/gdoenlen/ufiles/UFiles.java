// SPDX-License-Identifier: MIT
package com.github.gdoenlen.ufiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/** Unchecked java.nio.file.Files */
public class UFiles {
    private UFiles() {}

    public static long copy(InputStream in, Path target, CopyOption... options) {
        try {
            return Files.copy(in, target, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static long copy(Path source, OutputStream out) {
        try {
            return Files.copy(source, out);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path copy(Path source, Path target, CopyOption... options) {
        try {
            return Files.copy(source, target, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createDirectories(Path dir, FileAttribute<?>... attrs) {
        try {
            return Files.createDirectories(dir, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createDirectory(Path dir, FileAttribute<?>... attrs) {
        try {
            return Files.createDirectory(dir, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createFile(Path path, FileAttribute<?>... attrs) {
        try {
            return Files.createFile(path, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createLink(Path link, Path existing) {
        try {
            return Files.createLink(link, existing);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createSymbolicLink(Path link, Path target, FileAttribute<?>... attrs) {
        try {
            return Files.createSymbolicLink(link, target, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createTempDirectory(String prefix, FileAttribute<?>... attrs) {
        try {
            return Files.createTempDirectory(prefix, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createTempDirectory(Path dir, String prefix, FileAttribute<?>... attrs) {
        try {
            return Files.createTempDirectory(dir, prefix, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createTempFile(String prefix, String suffix, FileAttribute<?>... attrs) {
        try {
            return Files.createTempFile(prefix, suffix, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path createTempFile(Path dir, String prefix, String suffix, FileAttribute<?>... attrs) {
        try {
            return Files.createTempFile(dir, prefix, suffix, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static void delete(Path path) {
        try {
            Files.delete(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static boolean deleteIfExists(Path path) {
        try {
            return Files.deleteIfExists(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static boolean exists(Path path, LinkOption... options) {
        return Files.exists(path, options);
    }

    public static Stream<Path> find(
        Path start,
        int maxDepth,
        BiPredicate<Path, BasicFileAttributes> matcher,
        FileVisitOption... options
    ) {
        try {
            return Files.find(start, maxDepth, matcher, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Object getAttribute(Path path, String attribute, LinkOption... options) {
        try {
            return Files.getAttribute(path, attribute, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static <V extends FileAttributeView> V getFileAttributeView(
        Path path,
        Class<V> type,
        LinkOption... options
    ) {
        return Files.getFileAttributeView(path, type, options);
    }

    public static FileStore getFileStore(Path path) {
        try {
            return Files.getFileStore(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static FileTime getLastModifiedTime(Path path, LinkOption... options) {
        try {
            return Files.getLastModifiedTime(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static UserPrincipal getOwner(Path path, LinkOption... options) {
        try {
            return Files.getOwner(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... options) {
        try {
            return Files.getPosixFilePermissions(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static boolean isDirectory(Path path, LinkOption... options) {
        return Files.isDirectory(path, options);
    }

    public static boolean isExecutable(Path path) {
        return Files.isExecutable(path);
    }

    public static boolean isHidden(Path path) {
        try {
            return Files.isHidden(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static boolean isReadable(Path path) {
        return Files.isReadable(path);
    }

    public static boolean isRegularFile(Path path, LinkOption... options) {
        return Files.isRegularFile(path, options);
    }

    public static boolean isSameFile(Path path, Path path2) {
        try {
            return Files.isSameFile(path, path2);
        } catch (IOException ex) {
           throw new UncheckedIOException(ex);
        }
    }

    public static boolean isSymbolicLink(Path path) {
        return Files.isSymbolicLink(path);
    }

    public static boolean isWritable(Path path) {
        return Files.isWritable(path);
    }

    public static Stream<String> lines(Path path) {
        try {
            return Files.lines(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Stream<String> lines(Path path, Charset cs) {
        try {
            return Files.lines(path, cs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Stream<Path> list(Path dir) {
        try {
            return Files.list(dir);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static long mismatch(Path path, Path path2) {
        try {
            return Files.mismatch(path, path2);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path move(Path source, Path target, CopyOption... options) {
        try {
            return Files.move(source, target, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static BufferedReader newBufferedReader(Path path) {
        try {
            return Files.newBufferedReader(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static BufferedReader newBufferedReader(Path path, Charset cs) {
        try {
            return Files.newBufferedReader(path, cs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options) {
        try {
            return Files.newBufferedWriter(path, cs, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static BufferedWriter newBufferedWriter(Path path, Charset cs) {
        try {
            return Files.newBufferedWriter(path, cs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static SeekableByteChannel newByteChannel(Path path, OpenOption... options) {
        try {
            return Files.newByteChannel(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static SeekableByteChannel newByteChannel(
        Path path,
        Set<? extends OpenOption> options,
        FileAttribute<?>... attrs
    ) {
        try {
            return Files.newByteChannel(path, options, attrs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir) {
        try {
            return Files.newDirectoryStream(dir);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir, String glob) {
        try {
            return Files.newDirectoryStream(dir, glob);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<? super Path> filter) {
        try {
            return Files.newDirectoryStream(dir, filter);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static InputStream newInputStream(Path path, OpenOption... options) {
        try {
            return Files.newInputStream(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static OutputStream newOutputStream(Path path, OpenOption... options) {
        try {
            return Files.newOutputStream(path, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static boolean notExists(Path path, LinkOption... options) {
        return Files.notExists(path, options);
    }

    public static String probeContentType(Path path) {
        try {
            return Files.probeContentType(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static byte[] readAllBytes(Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static List<String> readAllLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static List<String> readAllLines(Path path, Charset cs) {
        try {
            return Files.readAllLines(path, cs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options) {
        try {
            return Files.readAttributes(path, type, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) {
        try {
            return Files.readAttributes(path, attributes, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static String readString(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path readSymbolicLink(Path link) {
        try {
            return Files.readSymbolicLink(link);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path setAttribute(Path path, String attribute, Object value, LinkOption... options) {
        try {
            return Files.setAttribute(path, attribute, value, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path setLastModifiedTime(Path path, FileTime time) {
        try {
            return Files.setLastModifiedTime(path, time);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path setOwner(Path path, UserPrincipal owner) {
        try {
            return Files.setOwner(path, owner);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path setPosixFilePermissions(Path path, Set<PosixFilePermission> perms) {
        try {
            return Files.setPosixFilePermissions(path, perms);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static long size(Path path) {
        try {
            return Files.size(path);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) {
        try {
            return Files.walk(start, maxDepth, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Stream<Path> walk(Path start, FileVisitOption... options) {
        try {
            return Files.walk(start, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path walkFileTree(Path start, FileVisitor<? super Path> visitor) {
        try {
            return Files.walkFileTree(start, visitor);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path write(Path path, byte[] bytes, OpenOption... options) {
        try {
            return Files.write(path, bytes, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) {
        try {
            return Files.write(path, lines, cs, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options) {
        try {
            return Files.write(path, lines, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path writeString(Path path, CharSequence csq, Charset cs, OpenOption... options) {
        try {
            return Files.writeString(path, csq, cs, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public static Path writeString(Path path, CharSequence csq, OpenOption... options) {
        try {
            return Files.writeString(path, csq, options);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}

/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter.stream;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class StreamCacheConverterLoader implements TypeConverterLoader {

    public StreamCacheConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, byte[].class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToByteArray((org.apache.camel.StreamCache) value, exchange));
        addTypeConverter(registry, java.nio.ByteBuffer.class, org.apache.camel.StreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToByteBuffer((org.apache.camel.StreamCache) value, exchange));
        addTypeConverter(registry, org.apache.camel.StreamCache.class, java.io.ByteArrayInputStream.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToStreamCache((java.io.ByteArrayInputStream) value, exchange));
        addTypeConverter(registry, org.apache.camel.StreamCache.class, java.io.InputStream.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToStreamCache((java.io.InputStream) value, exchange));
        addTypeConverter(registry, org.apache.camel.StreamCache.class, java.io.Reader.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToStreamCache((java.io.Reader) value, exchange));
        addTypeConverter(registry, org.apache.camel.StreamCache.class, org.apache.camel.converter.stream.CachedOutputStream.class, false,
            (type, exchange, value) -> org.apache.camel.converter.stream.StreamCacheConverter.convertToStreamCache((org.apache.camel.converter.stream.CachedOutputStream) value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
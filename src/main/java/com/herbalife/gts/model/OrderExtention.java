package com.herbalife.gts.model;

import com.datastax.oss.driver.api.core.ProtocolVersion;
import com.datastax.oss.driver.api.core.type.DataType;
import com.datastax.oss.driver.api.core.type.codec.TypeCodec;
import com.datastax.oss.driver.api.core.type.reflect.GenericType;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderExtention {

    @Column
    private String channel;
    @Column
    private BigDecimal totalFreight;
    @Column
    private BigDecimal payFreight;
    @Column
    private BigDecimal exchangedFreight;
    @Column
    private BigInteger exchangedPoints;
}

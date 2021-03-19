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
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@UserDefinedType
public class OrderDetail {
    @Column
    private Long productID;
    @Column
    private Long quantity;
    @Column
    private BigDecimal unitPrice;
    @Column
    private BigDecimal volumePoint;
    @Column
    private BigDecimal beforeDiscTaxAmount;
    @Column
    private BigDecimal afterDiscTaxAmount;
    @Column
    private BigDecimal discount;
}

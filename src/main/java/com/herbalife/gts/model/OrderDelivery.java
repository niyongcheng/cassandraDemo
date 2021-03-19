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

import java.math.BigInteger;
import java.nio.ByteBuffer;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@UserDefinedType
public class OrderDelivery{

    @Column
    private String orderDeliveryType;
    @Column
    private String senderName;
    @Column
    private String senderProvince;
    @Column
    private String senderCity;
    @Column
    private String senderDistrict;
    @Column
    private String senderAddress;
    @Column
    private String senderCompany;
    @Column
    private String senderPhone;
    @Column
    private String senderMobile;
    @Column
    private Integer expressCompanyId;
}

.class public Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private address:Ljava/lang/String;

.field private btName:Ljava/lang/String;

.field private isBind:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getBtName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    return-object v0
.end method

.method public isBind()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    return v0
.end method

.method public parseData([B)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    array-length v1, p1

    const/4 v3, 0x7

    if-gt v3, v1, :cond_2

    const/4 v1, 0x6

    new-array v4, v1, [B

    invoke-static {p1, v2, v4, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    add-int/lit8 v1, v3, 0x1

    array-length v4, p1

    if-gt v1, v4, :cond_3

    aget-byte v4, p1, v3

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    if-lez v4, :cond_3

    array-length v5, p1

    sub-int/2addr v5, v2

    if-gt v4, v5, :cond_3

    new-array v2, v4, [B

    invoke-static {p1, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v4

    :try_start_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v2}, Ljava/lang/String;-><init>([B)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return v1

    :cond_3
    return v3

    :cond_4
    :goto_3
    return v0
.end method

.method public setAddress(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    return-object p0
.end method

.method public setBind(Z)Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    return-object p0
.end method

.method public setBtName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;
    .locals 4

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0x3c

    if-le v1, v2, :cond_0

    new-instance v1, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    return-object p0
.end method

.method public toData()[B
    .locals 5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v1, 0x6

    new-array v2, v1, [B

    iget-object v3, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/RcspUtil;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object v3

    if-eqz v3, :cond_0

    array-length v4, v3

    if-ne v4, v1, :cond_0

    move-object v2, v3

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceBtInfo{isBind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", address=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", btName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->isBind:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->address:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->btName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

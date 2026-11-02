.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.super Lcom/jieli/jl_rcsp/model/device/settings/SettingData;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;",
            ">;"
        }
    .end annotation
.end field

.field public static final FUNC_4G_NETWORK_FUNCTION:I = 0x5

.field public static final FUNC_BOUND_DEVICE_STATE:I = 0x3

.field public static final FUNC_BRIGHTNESS:I = 0x1

.field public static final FUNC_DIAL_EXPAND_INFO:I = 0x7

.field public static final FUNC_FLASHLIGHT:I = 0x2

.field public static final FUNC_USING_RESOURCE:I = 0x4

.field public static final OP_NOTIFY:I = 0x2

.field public static final OP_READ:I = 0x0

.field public static final OP_SET:I = 0x1


# instance fields
.field private funcVersion:I

.field private function:I

.field private op:I

.field private payload:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III[B)V
    .locals 2

    .line 2
    invoke-static {p1, p2, p3, p4}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->convertData(III[B)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>(I[B)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    .line 4
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    .line 5
    iput p3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    .line 6
    iput-object p4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 7
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>(Landroid/os/Parcel;)V

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    return-void
.end method

.method private static convertData(III[B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-eqz p3, :cond_0

    invoke-virtual {v0, p3}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getFuncVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    return v0
.end method

.method public getFunction()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    return v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    return v0
.end method

.method public getPayload()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    return-object v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->parse([B)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->getData()[B

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x4

    if-ge v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    iput v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    aget-byte v2, v1, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    const/4 v2, 0x3

    aget-byte v2, v1, v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    array-length v2, v1

    if-ge v3, v2, :cond_2

    array-length v2, v1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    invoke-static {v1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SettingFunction{function="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", funcVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->function:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->funcVersion:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->op:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->payload:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

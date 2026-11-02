.class public Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAG_TWS_HEADSET:I = 0x1

.field public static final FLAG_WATCH:I


# instance fields
.field private data:[B

.field private type:I

.field private version:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    .line 4
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    .line 5
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    array-length v1, p1

    if-ge v2, v1, :cond_1

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->parsePayload([B)I

    move-result p1

    add-int/2addr p1, v2

    return p1

    :cond_1
    return v2

    :cond_2
    :goto_0
    return v0
.end method

.method public parsePayload([B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->type:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->version:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->data:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

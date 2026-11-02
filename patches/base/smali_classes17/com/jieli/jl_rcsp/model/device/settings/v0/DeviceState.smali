.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;
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
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;",
            ">;"
        }
    .end annotation
.end field

.field public static final INVALID_ADDRESS:Ljava/lang/String; = "00:00:00:00:00:00"


# instance fields
.field private bleAddress:Ljava/lang/String;

.field private classAddress:Ljava/lang/String;

.field private connectWay:I

.field private state:I

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    const-string p1, "00:00:00:00:00:00"

    if-nez p2, :cond_0

    move-object p2, p1

    .line 5
    :cond_0
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    if-nez p3, :cond_1

    move-object p3, p1

    .line 6
    :cond_1
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    .line 7
    iput p4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    .line 8
    iput p5, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->parse([B)I

    return-void
.end method

.method public static isValidAddress(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "00:00:00:00:00:00"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBleAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getClassAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getConnectWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    return v0
.end method

.method public isOnlyBle()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->isValidAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->isValidAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    const/16 v2, 0xf

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    const/4 v1, 0x6

    new-array v3, v1, [B

    const/4 v4, 0x1

    invoke-static {p1, v4, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    new-array v3, v1, [B

    const/4 v4, 0x7

    invoke-static {p1, v4, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    const/16 v1, 0xd

    aget-byte v1, p1, v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    const/16 v1, 0xe

    aget-byte p1, p1, v1

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    return v2

    :cond_1
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x6

    if-nez v1, :cond_0

    new-array v1, v2, [B

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_1

    new-array v1, v2, [B

    :cond_1
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    invoke-static {v3, v3, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceState{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", classAddress=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", bleAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connectWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->type:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->classAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->bleAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->state:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->connectWay:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

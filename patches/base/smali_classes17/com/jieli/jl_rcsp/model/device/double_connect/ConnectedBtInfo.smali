.class public Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private connectionNum:I

.field private mDeviceBtInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->CREATOR:Landroid/os/Parcelable$Creator;

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
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    .line 4
    sget-object v0, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getConnectionNum()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    return v0
.end method

.method public getDeviceBtInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    return-object v0
.end method

.method public parseConnectedDeviceBtData([B)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    return v0

    :cond_1
    array-length v1, p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    move p1, v0

    :goto_0
    if-ge p1, v1, :cond_3

    sub-int v2, v1, p1

    new-array v4, v2, [B

    invoke-static {v3, p1, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;-><init>()V

    invoke-virtual {v2, v4}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->parseData([B)I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v5, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr p1, v4

    goto :goto_0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    return p1

    :cond_4
    :goto_2
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/double_connect/DeviceBtInfo;->toData()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectedBtInfo{connectionNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceBtInfoList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->connectionNum:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/double_connect/ConnectedBtInfo;->mDeviceBtInfoList:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method

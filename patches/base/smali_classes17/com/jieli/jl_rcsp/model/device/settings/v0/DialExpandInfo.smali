.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final SHAPE_CIRCULAR:I = 0x1

.field public static final SHAPE_RECTANGLE:I = 0x2

.field public static final SHAPE_ROUNDED_RECTANGLE:I = 0x3


# instance fields
.field private color:I

.field private radius:I

.field private shape:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    const/4 v2, 0x7

    invoke-direct {p0, v2, v0, v0, v1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(III[B)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(Landroid/os/Parcel;)V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->radius:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->color:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    return-void
.end method

.method public static argb(BBBB)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    and-int/lit16 p1, p1, 0xff

    and-int/lit16 p2, p2, 0xff

    and-int/lit16 p3, p3, 0xff

    invoke-static {p0, p1, p2, p3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method public static int2Argb(I)[B
    .locals 0

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->color:I

    return v0
.end method

.method public getRadius()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->radius:I

    return v0
.end method

.method public getShape()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    return v0
.end method

.method public isCircular()Z
    .locals 2

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public parse([B)I
    .locals 7

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getPayload()[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x7

    if-ge v1, v2, :cond_1

    :goto_0
    return p1

    :cond_1
    const/4 v1, 0x0

    aget-byte v2, v0, v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    iput v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->radius:I

    const/4 v4, 0x4

    new-array v5, v4, [B

    const/4 v6, 0x3

    invoke-static {v0, v6, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v0, v5, v1

    aget-byte v1, v5, v2

    aget-byte v2, v5, v3

    aget-byte v3, v5, v6

    invoke-static {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->argb(BBBB)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->color:I

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DialExpandInfo{shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->radius:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->color:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->shape:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->radius:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;->color:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

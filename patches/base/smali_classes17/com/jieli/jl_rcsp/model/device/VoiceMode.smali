.class public Lcom/jieli/jl_rcsp/model/device/VoiceMode;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;"
        }
    .end annotation
.end field

.field public static final VOICE_MODE_CLOSE:I = 0x0

.field public static final VOICE_MODE_DENOISE:I = 0x1

.field public static final VOICE_MODE_TRANSPARENT:I = 0x2


# instance fields
.field private leftCurVal:I

.field private leftMax:I

.field private mode:I

.field private rightCurVal:I

.field private rightMax:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/VoiceMode$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/VoiceMode$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    return-void
.end method

.method public static isValidMode(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static parse([B)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 6

    if-eqz p0, :cond_1

    array-length v0, p0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {p0, v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    const/4 v3, 0x3

    invoke-static {p0, v3, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    const/4 v4, 0x5

    invoke-static {p0, v4, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    const/4 v5, 0x7

    invoke-static {p0, v5, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p0

    new-instance v2, Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;-><init>()V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->setMode(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->setLeftMax(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->setLeftCurVal(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->setRightMax(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->setRightCurVal(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBytes()[B
    .locals 5

    const/16 v0, 0x9

    new-array v0, v0, [B

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, v1

    add-int/2addr v1, v4

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v3

    array-length v4, v3

    invoke-static {v3, v2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v3

    add-int/2addr v1, v3

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v3

    array-length v4, v3

    invoke-static {v3, v2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v3

    add-int/2addr v1, v3

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v3

    array-length v4, v3

    invoke-static {v3, v2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getLeftCurVal()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    return v0
.end method

.method public getLeftMax()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    return v0
.end method

.method public getRightCurVal()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    return v0
.end method

.method public getRightMax()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    return v0
.end method

.method public setLeftCurVal(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    return-object p0
.end method

.method public setLeftMax(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    return-object p0
.end method

.method public setMode(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    return-object p0
.end method

.method public setRightCurVal(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    return-object p0
.end method

.method public setRightMax(I)Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VoiceMode{mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftCurVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rightCurVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->mode:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftMax:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightMax:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->leftCurVal:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->rightCurVal:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

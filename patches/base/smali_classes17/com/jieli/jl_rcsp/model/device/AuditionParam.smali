.class public Lcom/jieli/jl_rcsp/model/device/AuditionParam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/AuditionParam;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cluster:I

.field private dev:B

.field private name:Ljava/lang/String;

.field private op:B

.field private type:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AuditionParam$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AuditionParam$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    return v0
.end method

.method public getData()[B
    .locals 5

    const/4 v0, 0x7

    new-array v0, v0, [B

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    const/4 v3, 0x1

    aput-byte v1, v0, v3

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    const/4 v3, 0x2

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    const/4 v3, 0x3

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getDev()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    return v0
.end method

.method public setCluster(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    return-void
.end method

.method public setDev(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->name:Ljava/lang/String;

    return-void
.end method

.method public setType(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AuditionParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dev="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-byte p2, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->op:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-byte p2, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->type:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-byte p2, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->dev:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->cluster:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/AuditionParam;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

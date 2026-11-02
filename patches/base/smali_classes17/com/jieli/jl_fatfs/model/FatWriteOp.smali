.class public Lcom/jieli/jl_fatfs/model/FatWriteOp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_fatfs/model/FatWriteOp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private data:[B

.field private offset:I

.field private size:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_fatfs/model/FatWriteOp$1;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatWriteOp$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput v0, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->offset:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->size:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->data:[B

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

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->data:[B

    return-object v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->offset:I

    return v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->size:I

    return v0
.end method

.method public setData([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->data:[B

    return-void
.end method

.method public setOffset(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->offset:I

    return-void
.end method

.method public setSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->size:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FatWriteOp{offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->data:[B

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

    iget p2, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->offset:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->size:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_fatfs/model/FatWriteOp;->data:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

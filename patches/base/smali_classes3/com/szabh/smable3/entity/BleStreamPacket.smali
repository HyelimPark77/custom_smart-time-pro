.class public final Lcom/szabh/smable3/entity/BleStreamPacket;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleStreamPacket$Companion;
    }
.end annotation


# static fields
.field private static BUFFER_MAX_SIZE:J

.field public static final Companion:Lcom/szabh/smable3/entity/BleStreamPacket$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final mIndex:J

.field private final mPacket:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSize:J

.field private final mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleStreamPacket$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleStreamPacket$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleStreamPacket;->Companion:Lcom/szabh/smable3/entity/BleStreamPacket$Companion;

    const-wide/16 v0, 0x1e0

    sput-wide v0, Lcom/szabh/smable3/entity/BleStreamPacket;->BUFFER_MAX_SIZE:J

    return-void
.end method

.method public constructor <init>(IJJ[B)V
    .locals 1
    .param p6    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mPacket"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    iput p1, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mType:I

    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mSize:J

    iput-wide p4, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mIndex:J

    iput-object p6, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mPacket:[B

    return-void
.end method

.method public static final synthetic access$getBUFFER_MAX_SIZE$cp()J
    .locals 2

    sget-wide v0, Lcom/szabh/smable3/entity/BleStreamPacket;->BUFFER_MAX_SIZE:J

    return-wide v0
.end method

.method public static final synthetic access$setBUFFER_MAX_SIZE$cp(J)V
    .locals 0

    sput-wide p0, Lcom/szabh/smable3/entity/BleStreamPacket;->BUFFER_MAX_SIZE:J

    return-void
.end method


# virtual methods
.method public encode()V
    .locals 13

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v2, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mSize:J

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32$default(Lcom/bestmafen/baseble/data/BleWritable;JLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-wide v8, v1, Lcom/szabh/smable3/entity/BleStreamPacket;->mIndex:J

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32$default(Lcom/bestmafen/baseble/data/BleWritable;JLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleStreamPacket;->mPacket:[B

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p0, v0, v2, v3, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mPacket:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x9

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleStreamPacket(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mIndex:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mPacket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStreamPacket;->mPacket:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

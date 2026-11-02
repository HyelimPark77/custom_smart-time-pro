.class public final Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/watchface/WatchFaceElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TimeDigitData"
.end annotation


# instance fields
.field private final flag:B


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;-><init>(BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-byte p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    return-void
.end method

.method public synthetic constructor <init>(BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;-><init>(B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;BILjava/lang/Object;)Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-byte p1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->copy(B)Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    return v0
.end method

.method public final copy(B)Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;-><init>(B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    iget-byte p1, p1, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getFlag()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    invoke-static {v0}, Ljava/lang/Byte;->hashCode(B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TimeDigitData(flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/szabh/smable3/watchface/WatchFaceElement$TimeDigitData;->flag:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

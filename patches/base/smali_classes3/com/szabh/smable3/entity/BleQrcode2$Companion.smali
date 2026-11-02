.class public final Lcom/szabh/smable3/entity/BleQrcode2$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleQrcode2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleQrcode2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1878#2,3:50\n*S KotlinDebug\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n*L\n40#1:50,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleQrcode2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1878#2,3:50\n*S KotlinDebug\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n*L\n40#1:50,3\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleQrcode2$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getStream(Ljava/util/List;)[B
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleQrcode2;",
            ">;)[B"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array p1, v1, [B

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit16 v0, v0, 0x200

    new-array v0, v0, [B

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v3, Lcom/szabh/smable3/entity/BleQrcode2;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleWritable;->toByteArray()[B

    move-result-object v3

    mul-int/lit16 v2, v2, 0x200

    array-length v5, v3

    invoke-static {v3, v1, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, v4

    goto :goto_0

    :cond_2
    return-object v0
.end method

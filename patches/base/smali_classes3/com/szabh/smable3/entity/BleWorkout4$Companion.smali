.class public final Lcom/szabh/smable3/entity/BleWorkout4$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleWorkout4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleWorkout4$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMByteOrder()Ljava/nio/ByteOrder;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/BleWorkout4;->access$getMByteOrder$cp()Ljava/nio/ByteOrder;

    move-result-object v0

    return-object v0
.end method

.method public final setMByteOrder(Ljava/nio/ByteOrder;)V
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/szabh/smable3/entity/BleWorkout4;->access$setMByteOrder$cp(Ljava/nio/ByteOrder;)V

    return-void
.end method

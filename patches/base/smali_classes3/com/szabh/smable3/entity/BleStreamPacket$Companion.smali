.class public final Lcom/szabh/smable3/entity/BleStreamPacket$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleStreamPacket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleStreamPacket$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBUFFER_MAX_SIZE()J
    .locals 2

    invoke-static {}, Lcom/szabh/smable3/entity/BleStreamPacket;->access$getBUFFER_MAX_SIZE$cp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final setBUFFER_MAX_SIZE(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/szabh/smable3/entity/BleStreamPacket;->access$setBUFFER_MAX_SIZE$cp(J)V

    return-void
.end method

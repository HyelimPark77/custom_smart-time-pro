.class public final Lcom/szabh/smable3/entity/MusicEntity$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/MusicEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicEntity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicEntity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/MusicEntity$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(B)Lcom/szabh/smable3/entity/MusicEntity;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/szabh/smable3/entity/MusicEntity;->values()[Lcom/szabh/smable3/entity/MusicEntity;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/MusicEntity;->getMEntity()B

    move-result v4

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object p1, Lcom/szabh/smable3/entity/MusicEntity;->UNKNOWN:Lcom/szabh/smable3/entity/MusicEntity;

    return-object p1

    :cond_2
    return-object v3
.end method

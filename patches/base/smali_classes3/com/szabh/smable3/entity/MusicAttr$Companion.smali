.class public final Lcom/szabh/smable3/entity/MusicAttr$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/MusicAttr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/MusicAttr$Companion$WhenMappings;
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/MusicAttr$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final of(BB)Lcom/szabh/smable3/entity/MusicAttr;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .line 17
    sget-object v0, Lcom/szabh/smable3/entity/MusicEntity;->Companion:Lcom/szabh/smable3/entity/MusicEntity$Companion;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/MusicEntity$Companion;->of(B)Lcom/szabh/smable3/entity/MusicEntity;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/MusicAttr$Companion;->of(Lcom/szabh/smable3/entity/MusicEntity;B)Lcom/szabh/smable3/entity/MusicAttr;

    move-result-object p1

    return-object p1
.end method

.method public final of(Lcom/szabh/smable3/entity/MusicEntity;B)Lcom/szabh/smable3/entity/MusicAttr;
    .locals 3
    .param p1    # Lcom/szabh/smable3/entity/MusicEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/szabh/smable3/entity/MusicAttr$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_a

    const/4 v2, 0x3

    if-eq p1, v0, :cond_5

    if-eq p1, v2, :cond_0

    .line 2
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_0
    if-nez p2, :cond_1

    .line 3
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_1
    if-ne p2, v1, :cond_2

    .line 4
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_2
    if-ne p2, v0, :cond_3

    .line 5
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_3
    if-ne p2, v2, :cond_4

    .line 6
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    .line 7
    :cond_4
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_5
    if-nez p2, :cond_6

    .line 8
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_INDEX:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_6
    if-ne p2, v1, :cond_7

    .line 9
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_COUNT:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_7
    if-ne p2, v0, :cond_8

    .line 10
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_SHUFFLE_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_8
    if-ne p2, v2, :cond_9

    .line 11
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_REPEAT_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    .line 12
    :cond_9
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_a
    if-nez p2, :cond_b

    .line 13
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_NAME:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_b
    if-ne p2, v1, :cond_c

    .line 14
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    :cond_c
    if-ne p2, v0, :cond_d

    .line 15
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_VOLUME:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1

    .line 16
    :cond_d
    sget-object p1, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    return-object p1
.end method

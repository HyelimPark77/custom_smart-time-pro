.class public final Lcom/sma/smartv3/dto/ChatAiMode$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/dto/ChatAiMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(I)Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;->XIi00iiXO()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/dto/ChatAiMode;

    return-object p1
.end method

.method public final XIi00iiXO()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/sma/smartv3/dto/ChatAiMode;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/dto/ChatAiMode;->access$getFlagToEnumMap$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final XO0O10(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;->XIi00iiXO()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iO(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;->XIi00iiXO()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/dto/ChatAiMode;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ChatAiMode;->getModelName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

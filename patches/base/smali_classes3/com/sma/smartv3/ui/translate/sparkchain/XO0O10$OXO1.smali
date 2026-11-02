.class public final Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;
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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;

    const/16 v10, 0x1fc

    const/4 v11, 0x0

    const-string v1, "cn"

    const-string v2, "en"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final XIi00iiXO()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->OXO1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final iO()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->XIi00iiXO()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

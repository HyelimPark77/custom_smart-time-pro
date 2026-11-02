.class public final synthetic Lcom/sma/smartv3/ui/translate/sparkchain/XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic IO:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XIi00iiXO;->IO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XIi00iiXO;->IO:Ljava/lang/String;

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$save2DataBase$1;->O00(Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

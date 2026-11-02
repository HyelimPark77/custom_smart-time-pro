.class public final synthetic Lcom/sma/smartv3/ui/translate/sparkchain/IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/IiI10X;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/IiI10X;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1;->O00(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method

.class public final Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$updateAiRecord"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->IiI10X(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final O00(Lcom/android/mltcode/paycertificationapi/mq4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_displayFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/mq4;->X1ii()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->X1ii()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/mq4;->OIX0iXi()Ljava/lang/String;

    move-result-object v8

    new-instance v5, Lcom/android/mltcode/paycertificationapi/mq4;

    const/16 v12, 0x29

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$get_displayFlow$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    invoke-interface {p1, v5}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q87;

    invoke-direct {v0, v7, v10}, Lcom/android/mltcode/paycertificationapi/q87;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p2

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iOOX010X(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1$OXO1;->O00(Lcom/android/mltcode/paycertificationapi/mq4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

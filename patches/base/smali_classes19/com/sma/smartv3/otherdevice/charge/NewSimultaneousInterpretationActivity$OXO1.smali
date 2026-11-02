.class public final Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1563#2:655\n1634#2,3:656\n774#2:659\n865#2,2:660\n1563#2:662\n1634#2,3:663\n774#2:666\n865#2,2:667\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n*L\n111#1:655\n111#1:656,3\n112#1:659\n112#1:660,2\n160#1:662\n160#1:663,3\n161#1:666\n161#1:667,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNewSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1563#2:655\n1634#2,3:656\n774#2:659\n865#2,2:660\n1563#2:662\n1634#2,3:663\n774#2:666\n865#2,2:667\n*S KotlinDebug\n*F\n+ 1 NewSimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$binauralMicrosoftCallBack$1\n*L\n111#1:655\n111#1:656,3\n112#1:659\n112#1:660,2\n160#1:662\n160#1:663,3\n161#1:666\n161#1:667,2\n*E\n"
    }
.end annotation


# instance fields
.field public OXO1:J

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XO0O10(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)V

    return-void
.end method

.method public static final XO0O10(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getRv(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final O00(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    return-void
.end method

.method public final iO()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    return-wide v0
.end method

.method public onIdentifyResults(ILjava/lang/String;)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "str"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  sendTranslate  onIdentifyResults status = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " content = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string v4, "  sendTranslate  onIdentifyResults parts = "

    const/16 v5, 0xa

    const-string v6, "[*]+"

    const-string v7, "  sendTranslate  onIdentifyResults content = "

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v1, v9, :cond_9

    const/4 v10, 0x2

    if-eq v1, v10, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Lkotlin/text/Regex;

    invoke-direct {v1, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v8}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v8

    :goto_2
    if-ge v3, v2, :cond_f

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v5, v3, 0x1

    if-ge v4, v5, :cond_5

    new-instance v11, Lcom/sma/smartv3/model/AISpeech;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    const/16 v23, 0x1fa

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v11 .. v24}, Lcom/sma/smartv3/model/AISpeech;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v11, v8}, Lcom/sma/smartv3/model/AISpeech;->setLanguageModel(I)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v4}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Lcom/sma/smartv3/model/AISpeech;->setLang(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v4}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Lcom/sma/smartv3/model/AISpeech;->setTargetLang(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v4}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Lcom/sma/smartv3/model/AISpeech;->setTtsVoiceName(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-lez v3, :cond_4

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/AISpeech;

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AISpeech;->getEndTime()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setStartTime(J)V

    goto :goto_3

    :cond_4
    iget-wide v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    invoke-virtual {v11, v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setStartTime(J)V

    :goto_3
    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/AISpeech;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setEndTime(J)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    invoke-static {v4, v6, v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$binauralSendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;Lcom/sma/smartv3/model/AISpeech;I)V

    :cond_5
    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v5, :cond_8

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AISpeech;->getStatus()I

    move-result v4

    if-ne v4, v9, :cond_8

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v7}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v5, :cond_6

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v7}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/AISpeech;->getStatus()I

    move-result v7

    if-ne v7, v9, :cond_6

    move v7, v9

    goto :goto_4

    :cond_6
    move v7, v8

    :goto_4
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "  sendTranslate  onIdentifyResults istrue = "

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "get(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setText(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Lcom/sma/smartv3/model/AISpeech;->setStatus(I)V

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/model/AISpeech;->setLanguageModel(I)V

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v7}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setLang(Ljava/lang/String;)V

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v7}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setTargetLang(Ljava/lang/String;)V

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v7}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/sma/smartv3/model/AISpeech;->setTtsVoiceName(Ljava/lang/String;)V

    if-lez v3, :cond_7

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v7}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v7

    add-int/lit8 v11, v3, -0x1

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/AISpeech;->getEndTime()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12}, Lcom/sma/smartv3/model/AISpeech;->setStartTime(J)V

    goto :goto_5

    :cond_7
    iget-wide v11, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    invoke-virtual {v6, v11, v12}, Lcom/sma/smartv3/model/AISpeech;->setStartTime(J)V

    :goto_5
    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v7}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getStartTime()J

    move-result-wide v13

    sub-long/2addr v11, v13

    invoke-virtual {v6, v11, v12}, Lcom/sma/smartv3/model/AISpeech;->setEndTime(J)V

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v6}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v7}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v7

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "  sendTranslate  onIdentifyResults aiSpeechList "

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v4}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/AISpeech;

    invoke-static {v4, v6, v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$binauralSendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;Lcom/sma/smartv3/model/AISpeech;I)V

    :cond_8
    move v3, v5

    goto/16 :goto_2

    :cond_9
    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Lkotlin/text/Regex;

    invoke-direct {v1, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v8}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_b

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_8
    if-ge v8, v2, :cond_f

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v4, v8, 0x1

    if-ge v3, v4, :cond_d

    new-instance v9, Lcom/sma/smartv3/model/AISpeech;

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    iget-wide v5, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    const/16 v21, 0x17a

    const/16 v22, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v19, 0x0

    move-wide/from16 v17, v5

    invoke-direct/range {v9 .. v22}, Lcom/sma/smartv3/model/AISpeech;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v4, :cond_e

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v3}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/AISpeech;

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/sma/smartv3/model/AISpeech;->setText(Ljava/lang/String;)V

    :cond_e
    move v8, v4

    goto :goto_8

    :cond_f
    :goto_9
    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getMAdapter$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v1

    if-nez v1, :cond_10

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_10
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/s71;

    invoke-direct {v3, v2}, Lcom/android/mltcode/paycertificationapi/s71;-><init>(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)V

    const-wide/16 v4, 0x32

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onIdentifyResultsDetectedLanguage(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "str"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "detectedLanguage"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStartTransmission()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartTransmission "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/NewSimultaneousInterpretationActivity$OXO1;->OXO1:J

    return-void
.end method

.method public onStopTransmission()V
    .locals 0

    return-void
.end method
